1. 도메인주제 :
   1-1. 시나리오(최소 3개 이상)
   - ㅇㅇㅇ
   - ㅇㅇㅇ
   - ㅇㅇㅇ
   - ㅇㅇㅇ
* 바운디드컨텍티드는 최소 3개
2. 이벤트스토밍 모델
  ![image](https://github.com/heri0130/stharry/assets/133316599/6b6ca294-8749-44f7-94ad-fc9c3ed7997b)

3. 도메인이벤트 pub/sub
   ![image](https://github.com/heri0130/stharry/assets/133316599/4d6b6fa0-b439-498c-b36f-fbeb8678ffcf)


   
# 

## Model
www.msaez.io/#/storming/12st_harry_1106

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- order
- delivery
- product


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- order
```
 http :8088/orderMgmts id="id" userId="userId" productName="productName" productId="productId" qty="qty" status="status" orderDt="orderDt" address="address" 
```
- delivery
```
 http :8088/deliveryMgmts id="id" userId="userId" orderId="orderId" productName="productName" productId="productId" qty="qty" status="status" deliveryDt="deliveryDt" 
```
- product
```
 http :8088/inventoryMgmts id="id" productName="productName" productImg="productImg" stock="stock" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

