package io.asfjava.ui.addons.generators;

import java.lang.reflect.Field;

import com.fasterxml.jackson.databind.node.ObjectNode;

import io.asfjava.ui.addons.forms.CloudinaryFileUpload;
import io.asfjava.ui.core.generators.FormDefinitionGenerator;

public class CloudinaryFileUploadGenerator implements FormDefinitionGenerator {

	@Override
	public void generate(ObjectNode fieldFormDefinition, Field field) {
		CloudinaryFileUpload annotation = field.getAnnotation(CloudinaryFileUpload.class);

		fieldFormDefinition.put("key", field.getName());
		fieldFormDefinition.put("type", "cloudinaryfileupload");

		fieldFormDefinition.put("cloudName", annotation.cloudName());
		fieldFormDefinition.put("uploadPreset", annotation.uploadPreset());
		fieldFormDefinition.put("label", annotation.title());
	}

	@Override
	public String getAnnotation() {
		return CloudinaryFileUpload.class.getName();
	}

}
