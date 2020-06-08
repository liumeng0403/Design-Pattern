# 设计模式 原则一
* 开闭原则（Open Close Principle）：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类。

# 设计模式 原则二
* 里氏代换原则（Liskov Substitution Principle）：任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现。

# 设计模式 原则三
* 依赖倒转原则（Dependence Inversion Principle）：针对接口编程，依赖于抽象而不依赖于具体。

# 设计模式 原则四
* 接口隔离原则（Interface Segregation Principle）：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。

# 设计模式 原则五
* 迪米特法则，又称最少知道原则（Demeter Principle）：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

# 设计模式 原则六
* 合成复用原则（Composite Reuse Principle）：尽量使用合成/聚合的方式，而不是使用继承。

# 创建型模式
* 工厂模式（Factory Pattern）
* 抽象工厂模式（Abstract Factory Pattern）
* 单例模式（Singleton Pattern）
* 建造者模式（Builder Pattern）
* 原型模式（Prototype Pattern）

# 结构型模式
* 适配器模式（Adapter Pattern）
* 桥接模式（Bridge Pattern）
* 过滤器模式（Filter、Criteria Pattern）
* 组合模式（Composite Pattern）
* 装饰器模式（Decorator Pattern）
* 外观模式（Facade Pattern）
* 享元模式（Flyweight Pattern）
* 代理模式（Proxy Pattern）

# 行为型模式
* 责任链模式（Chain of Responsibility Pattern）
* 命令模式（Command Pattern）
* 解释器模式（Interpreter Pattern）
* 迭代器模式（Iterator Pattern）
* 中介者模式（Mediator Pattern）
* 备忘录模式（Memento Pattern）
* 观察者模式（Observer Pattern）
* 状态模式（State Pattern）
* 空对象模式（Null Object Pattern）
* 策略模式（Strategy Pattern）
* 模板模式（Template Pattern）
* 访问者模式（Visitor Pattern）

# 框架模式
* MVC 模式（MVC Pattern）
* 业务代表模式（Business Delegate Pattern）
* 组合实体模式（Composite Entity Pattern）
* 数据访问对象模式（Data Access Object Pattern）
* 前端控制器模式（Front Controller Pattern）
* 拦截过滤器模式（Intercepting Filter Pattern）
* 服务定位器模式（Service Locator Pattern）
* 传输对象模式（Transfer Object Pattern）

# 模式使用关系描述

