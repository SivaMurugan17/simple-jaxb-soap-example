# JAXB and SOAP basic examples


## 1. JAXB - Java Architechture for XML Binding 

### XSD : XML Schema Definition 

To extract Java objects from XML files, we need XSD schema files.

### a)  Generating XSD schemas from POJO classes
We can generate the XSD schemas for the pojo classes using the `schemagen` goal of the plugin `jaxb2-maven-plugin` from `org.codehaus.mojo`.
```
Note:
For the fields to be included in the schema, we need to give getters and setters for the fields.
```
By default,

the xsd files are generated under /target/generated-resources/schemagen


### b) Generating POJO classes from XSD schemas 

This is done using the `xjc` goal of the plugin.

By default,
1. XSD files should be under src/main/xsd
2. the generated pojo classes are under /target/generated-sources/jaxb

---
## 2. SOAP - Simple Object Access Protocol

- XML based protocol
- exchange messages using a web service

### WSDL - Web Service Description Language

This describes the web service using service, endpoint, binding, interface, operation, message, types.

In this code, we convert .wsdl files to pojo classes using `wsimport` goal of the `jaxws-maven-plugin` from `com.sum.xml.ws`.

By default,
1. wsdl files should be under src/main/wsdl
2. the generated classes will be under target/generated-sources/wsimport

---
