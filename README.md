# HW_CleanCode

Благодаря созданному мной простейшему варианту магазина попробую показать то, что более-менее ясно усвоил поданный материал по Чистому коду.

1. Магические числа - при написании кода ни разу не было использовано так называемое "магическое число", ни разу не использовано число напрямую.
2. DRY - для распечатки текущего состояния склада\корзины нужно каждый раз распечатывать мапу и, соответственно, я сделал интерфейс printable с помощью которого распечатываю вышеуказанные мапы.

## SOLID

Single-responsibility principle - каждый делает только то, для чего он предназначен.  
Классы WareHouse и Cart могут хранить в себе данные и изменять их, но за распечатку либо фильтрацию ответственные другие сущности.

Open-closed principle - открытость для расширения и закрытость для модификации.  
Расширение класса WareHouse благодаря интерфейсам без использования дполнительных методов.

Liskov substitution principle - наследуй только тогда, когда можешь играть роль за предка. 
В моем магазине не используется наследование, поэтому показать соблюдение данного принципан не вижу возможным.

Interface segregation principle - разделение больших интерфейсов на маленькие.  
Создание нескольких интерфейсов фильтрации: по цене и по тэгу.

Dependency inversion principle - зависеть от абстракций, а не от имплементаций.  
В своем коде не было возможности продемонстрировать данный принцип, так как не создавал классы на основании интерфейсов.