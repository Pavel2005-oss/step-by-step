## Вариант 1


### Option D — Объектно‑ориентированное программирование


#### Сценарий

Компания управляет флотом **доставочных дронов** , которые привозят посылки в разные зоны города. Когда дрон прилетает, в системе фиксируется его уникальный **серийный номер**  (строка из восьми символов, например `D1A2B3C4`). Система распределяет дроны по посадочным площадкам, следит за временем стоянки, взимает административный сбор, а также печатает купоны на бесплатную замену аккумулятора.


---


13. Класс `LandingPad` и класс `Drone`

Ниже приведён фрагмент кода.



```java
public class LandingPad {
    private Drone[] drones;
    private String zoneName;

    public LandingPad(String zoneName, int capacity) {
        this.zoneName = zoneName;
        if (capacity > 200) capacity = 200;
        drones = new Drone[capacity];
    }

    public String getZoneName() { return zoneName; }

    public int getCapacity() { return drones.length; }

    public int findDrone(String serial) {
        //TODO: вернуть индекс дрона с заданным серийным номером
        return -1;
    }
}
```



```java
public class Drone {
    private String serial;
    private boolean needsService;
    private byte colour;

    public final static byte BLACK = 1;
    public final static byte WHITE = 2;
    public final static byte RED   = 3;
    private final static double ADMIN_FEE = 4.5;

    public Drone(String serial) { this.serial = serial; }
    public Drone(String serial, byte colour) {
        this.serial = serial; this.colour = colour;
    }

    public void setNeedsService(boolean flag) { needsService = flag; }
    public boolean getNeedsService() { return needsService; }
    public String  getSerial()       { return serial; }

    public double pay(int minutes) {
        //TODO: вернуть административный сбор, если стоянка ≤ 60 мин
        return 0.0;
    }
}
```


##### (a)

Укажите **одно**  последствие использования модификатора `static` при объявлении констант `BLACK`, `WHITE`, `RED`.  [2]

##### (b)

Опишите взаимоотношение между классами `LandingPad` и `Drone`.  [3]

##### (c)

Объясните, почему в методе `setNeedsService` необходимо употреблять ключевое слово `this`.  [2]

##### (d)

(i) Напишите код, создающий объект класса `Drone` с серийным номером `D8F9E0A1`.  [2]

(ii) С помощью метода‑селектора установите цвет созданного объекта как *красный*.  [2]


---



### 14. Добавление дрона в первое свободное место


##### (a)

Сконструируйте метод `addDrone(Drone d)`, который добавит дрон в первый свободный элемент массива `drones[]`, вернёт его индекс или `‑1`, если места нет.  [6]

##### (b)

Назовите **два**  отличия **наследования**  от **агрегации** .  [4]
Два подкласса, `HeavyDrone` и `LightDrone`, расширяют `Drone`.


```java
public class HeavyDrone extends Drone {
    public static double minuteFee = 0.12;
    public double pay(int minutes) {
        //TODO: вернуть полную стоимость
    }
}
```



```java
public class LightDrone extends Drone {
    public static double minuteFee = 0.07;
    public double pay(int minutes) {
        //TODO: вернуть полную стоимость
    }
}
```


##### (c)

Создайте **UML‑диаграмму** , демонстрирующую отношения `LandingPad`, `Drone`, `HeavyDrone`, `LightDrone`. Атрибуты и методы расписывать не нужно.  [4]

##### (d)

(i) Реализуйте метод `pay` в классе `Drone`: если дрон стоял ≤ 60 минут, возвращается `ADMIN_FEE`, иначе `0`.  [2]

(ii) Реализуйте метод `pay` в классе `HeavyDrone`, который использует `super.pay()` и добавляет плату за каждую минуту стоянки.  [2]

##### (e)

Объясните, почему тип `Drone` является корректным для массива `drones[]`, содержащего объекты `HeavyDrone` и `LightDrone`.  [2]


---



### 15. Купоны на замену аккумулятора

Руководство решило: **каждому 40‑му тяжёлому**  и **каждому 70‑му лёгкому**  дрону выдаётся купон.

Код печати купона реализован в статическом методе `Coupons.printBatteryVoucher()`.

##### (a)

Без кода опишите, что нужно изменить в методе `addDrone` и в классе `LandingPad`, чтобы схема работала.  [5]

##### (b)

Предложите **три**  дополнительных теста, чтобы убедиться, что схема купонов работает.  [3]
Метод `removeDrone` внутри `LandingPad` ищет дрон по серийному номеру, удаляет его (ставит `null`) и возвращает ссылку или `null`.

##### (c)

Напишите метод `removeDrone`.  [6]


---



### 16. Карта посадочных площадок

Одну стандартную площадку можно разделить на две для лёгких дронов. Программист решил использовать **двумерный массив** :


```java
Drone pads[][] = new Drone[2][150];
```


##### (a)

(i) Укажите **одно**  преимущество такого массива.  [1]

(ii) Укажите **один**  недостаток.  [1]
Полиция просит быстро искать дрон по серийному номеру; предлагается **бинарное дерево поиска (BST)** .

##### (b)


Объясните, почему поиск в BST быстрее, чем линейный просмотр двумерного массива.  [3]


##### (c)


Перечислите шаги переноса данных из массива в BST.  [5]



---



### 17. Узкий ангар и стек


В узком ангаре дроны ставятся в одну линию (стек). Чтобы достать первый поставленный дрон, все последующие приходится убирать и возвращать назад.

Класс `DroneStack` реализует методы

`isEmpty()`, `push(Drone d)`, `pop()`.


```java
public static void staffRetrieveDrone(DroneStack stack, String serial){
    DroneStack temp = new DroneStack();
    // TODO
}
```


##### (a)

Составьте код метода `staffRetrieveDrone`, который достаёт дрон с нужным серийным номером и возвращает остальные на место.  [6]

##### (b)

Сравните использование **массива**  и **односвязного списка**  для реализации стека.  [4]

