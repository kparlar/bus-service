# bus-service
IETT Spring Boot App


## docker

#### Build
>> docker build -t bus-service .

#### Run
>> docker run -p 8180:8180 bus-service




#### AWS Image Registery

To Push your images
created a image repository on aws side:
kparlar/bus-tracker

We need to build the image and puh it under this registery

###### To build
>> docker build -t bus-service .
###### To Tag
>> docker tag bus-service 091174581454.dkr.ecr.eu-central-1.amazonaws.com/kparlar/bus-tracker:bus-service-1.0.0
###### To Push
First login the docker registery on aws
>> aws ecr get-login-password --region eu-central-1 | docker login --username AWS --password-stdin 091174581454.dkr.ecr.eu-central-1.amazonaws.com
will display Login Succeeded message
push tag
>> docker push 091174581454.dkr.ecr.eu-central-1.amazonaws.com/kparlar/bus-tracker:bus-service-1.0.0

![AWS_REGISTERY](/documents/img/aws-registery.png?raw=true "AWS Registery")