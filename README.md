# design_patterns



# design_patterns：maven父工程，设计模式



## 	01_factory_patterns:工厂模式

## 	03_builder_pattern:建造者模式

## 	04_prototype_pattern:原型模式

## 	05_adapter_pattern:适配器 模式

## 	06_bridge:桥接模式

将抽象部分与它的实现部分分离，实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让他们独立变化，减少他们之间的耦合。

### example2:

桥接模式在源码中的表现为，Thread、Runable

Thread的构造方法中有一个可以传入一个Runable的实例，

Thread的对象在start开始的时候，实际执行的是Runable中的run方法

## 	09_decorator_pattern：装饰者模式

## 10_flyweight：享元模式

java中的string，如果存在直接返回，如果不存在直接创建一个保存在缓存池中。

数据库的连接池





