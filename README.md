# mtd_py_sidecar
to expose the interfaces of python. 

## 用作将no jvm 语言服务注册到eureka 如node.js,python etc.

+ 版本为 Greenwich.SR1(RELEASE).

+ 端口8130，监听的端口为5000，关闭了config server，开启需修改bootstrap.yml文件

+ 坑点：docker内网ip不一，故localhost不一，需要具体到ip（我用的是手机热点的ip）

+ 启动py采用的是命令行（flask）python app.py runserver -h xxx.xxx.xxx.xxx -p 5000

### 获得使用版：
```
部署版，需要配合eureka：
  docker pull leodpen/pyclient:latest
  
本地测试python端（no jvm语言）版：
  docker pull leodpen/pyclient:local

docker run -p 8130:8130 -d leodpen/pyclient:{tag}
```

 


