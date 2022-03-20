##【项目笔记】
Exception in thread "main" java.lang.NoClassDefFoundError: javax/xml/bind/DatatypeConverter
at io.jsonwebtoken.impl.Base64Codec.decode(Base64Codec.java:26)
at io.jsonwebtoken.impl.DefaultJwtBuilder.signWith(DefaultJwtBuilder.java:99)
at com.lys.emsystem.utils.JWTUtils.createToken(JWTUtils.java:23)
at com.lys.emsystem.utils.JWTUtils.main(JWTUtils.java:44)
Caused by: java.lang.ClassNotFoundException: javax.xml.bind.DatatypeConverter
at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:583)
at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
... 4 more

