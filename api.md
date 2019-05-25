11fc138c216db9bd2a8387d0b76e17509b

```bash
curl -v -X POST --user admin:11fc138c216db9bd2a8387d0b76e17509b http://localhost:8080/job/integrate-with-ijra/build --data-urlencode json='{"parameter": [{"name":"PERSON", "value":"curl"}]}'
```

Basic YWRtaW46MTFmYzEzOGMyMTZkYjliZDJhODM4N2QwYjc2ZTE3NTA5Yg==
```bash
curl -v -X POST -H "Authorization: Basic YWRtaW46MTFmYzEzOGMyMTZkYjliZDJhODM4N2QwYjc2ZTE3NTA5Yg==" http://localhost:8080/job/integrate-with-ijra/build --data-urlencode json='{"parameter": [{"name":"PERSON", "value":"curl"}]}'
```

curl -i -u admin:11fc138c216db9bd2a8387d0b76e17509b -X POST http://localhost:8080/job/integrate-with-ijra/buildWithParameters -d "PERSON=curl"