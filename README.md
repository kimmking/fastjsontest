# fastjsontest

## jersey

- Restinit.java里register(FastJsonProvider.class); 使用fastjson 1.2.35，

`
curl  -H  Accept:application/javascript http://localhost:8080/rest/hello/a/1?callback=func -v

curl  -H  Accept:application/javascript http://localhost:8080/rest/hello/a/1?callback=functionXXXXXXXXXXXXXXXXXXXXXXXXXX -v

func({"bookId":1,"bookName":"Pythoxxxxxxxxxx","publisher":"xsdfoasjfoasjfdoajsfdoajsofddjsoifzzzzzzzzzzzzzzzzzzzzzzzzzzzzz

functionXXXXXXXXXXXXXXXXXXXXXXXXXX({"bookId":1,"bookName":"Pythoxxxxxxxxxx","publisher":"xsdfoasjfoasjfdoajsfdoajsofddjsoifzz
`

可以看到response header的content length一直不变，但是json被截断了。

使用目前主干上的1.2.36-SNAPSHOT已经修复了这个问题。

- register(JacksonJsonProvider.class); 使用Jackson不存在这个问题

