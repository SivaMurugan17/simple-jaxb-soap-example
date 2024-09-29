# JAXB - Java Architechture for XML Binding 

### XSD : XML Schema Definition

Why do we need XSD ? 

To extract Java objects from XML files, we need to reference XSD schema files.

---

In this code, we are using the plugin `jaxb2-maven-plugin` from `org.codehaus.mojo`

## Generating XSD schemas from POJO
We can generate the XSD schemas for the pojo classes we wrote using the `schemagen` goal of the plugin.



```
Note:
For the fields to be included in the schema, we need to give getters and setters for the fields.
```
By default,

the xsd files are generated under /target/generated-resources/schemagen


## Generating POJO from XSD schemas 

This is done using the `xjc` goal of the plugin.

By default,
1. XSD files should be under src/main/xsd
2. the generated pojo classes are under /target/generated-sources/jaxb