## DAT250: Software Technology Experiment Assignment 6

https://github.com/selabhvl/dat250public/blob/master/expassignments/expass6.md

### Experiment 1: RabbitMQ Installation

```
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4.0-management
```

### Experiment 2: Hello World

- [Producer.java](src/main/java/no/hvl/dat250/h600871/ex2/Producer.java): Connects to RabbitMQ on localhost and sends message "Hello World!"
- [Consumer.java](src/main/java/no/hvl/dat250/h600871/ex2/Consumer.java): Connects to RabbitMQ on localhost and listens for messages

### Experiment 3: Work Queues

- [Dispatcher.java](src/main/java/no/hvl/dat250/h600871/ex3/Dispatcher.java): Sends messages to RabbitMQ
- [Worker.java](src/main/java/no/hvl/dat250/h600871/ex3/Worker.java): Recieves messages from RabbitMQ and does some work with them
- [Example.java](src/main/java/no/hvl/dat250/h600871/ex3/Example.java): Runs a scenario starting 5 dispatchers and 2 workers

Output from example scenario:
```
[Dispatcher] Sent 'First Message.'
[Dispatcher] Sent 'Second Message..'
[Dispatcher] Sent 'Third Message...'
[Dispatcher] Sent 'Fourth Message....'
[Dispatcher] Sent 'Fifth Message.....'
[Worker 1] Waiting for messages
[Worker 1] Received 'First Message.'
[Worker 2] Waiting for messages
[Worker 2] Received 'Second Message..'
[Worker 1] Done
[Worker 1] Received 'Third Message...'
[Worker 2] Done
[Worker 2] Received 'Fourth Message....'
[Worker 1] Done
[Worker 1] Received 'Fifth Message.....'
[Worker 2] Done
[Worker 1] Done
```

### Experiment 4: Topics

- [ReceiveLogs.java](src/main/java/no/hvl/dat250/h600871/ex4/ReceiveLogs.java): Listens for log messages from RabbitMQ
- [EmitLog.java](src/main/java/no/hvl/dat250/h600871/ex4/EmitLog.java): Sends log messages to RabbitMQ
- [Example.java](src/main/java/no/hvl/dat250/h600871/ex4/Example.java): Runs an example scenario 

Output from example scenario:
```
[ReceiveLogs] Waiting for messages
[ReceiveLogs] Received 'info: Hello World!'
[EmitLog] Sent 'info: Hello World!'
[EmitLog] Sent 'Example log message'
[ReceiveLogs] Received 'Example log message'
```