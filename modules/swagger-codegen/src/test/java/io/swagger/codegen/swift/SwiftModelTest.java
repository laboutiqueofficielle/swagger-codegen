package io.swagger.codegen.swift;

import io.swagger.codegen.*;
import io.swagger.codegen.languages.SwiftCodegen;
import io.swagger.models.*;
import io.swagger.models.properties.*;

import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("static-method")
public class SwiftModelTest {

    @Test(description = "convert a simple java model")
    public void simpleModelTest() {
        final Model model = new ModelImpl()
                .description("a sample model")
                .property("id", new LongProperty())
                .property("name", new StringProperty())
                .property("createdAt", new DateTimeProperty())
                .property("binary", new BinaryProperty())
                .property("byte", new ByteArrayProperty())
                .property("uuid", new UUIDProperty())
                .property("dateOfBirth", new DateProperty())
                .required("id")
                .required("name")
                .discriminator("test");
        final DefaultCodegen codegen = new SwiftCodegen();
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 7);
        Assert.assertEquals(cm.discriminator,"test");
    }

}
