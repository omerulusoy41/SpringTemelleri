## Dependency Injection
- Daha rahat yonetim adina bagimli olunan objeyi baska bir yerde yaratip nesneyi set ile ya da consructora gecmeye dependency injection denir.Bu sekilde nesen olusturmak hem bagimliligi bir nebze yonetme hemde null pointer exception hatasini azaltma da ise yarar.Bir seyi kullanmak arayuzunu bilmektir,bir seyi yaratmak yapisini bilmektir.(program to interface not an implemenation)  
- Bagimliklar soyut yapilarda olusturulmalidir.  
![Profile](https://github.com/omerulusoy41/SpringTemelleri/blob/master/ss/DI.jpg)  
## Inversion Of Controll
Kontrolün Ters Çevrilmesi, bir programın nesnelerinin veya bölümlerinin kontrolünü bir kaba veya çerçeveye aktaran yazılım mühendisliğinde bir ilkedir. Bunu çoğunlukla nesne yönelimli programlama bağlamında kullanırız.

Özel kodumuzun bir kitaplığa çağrılar yaptığı geleneksel programlamanın aksine, IoC, bir programın akışının kontrolünü ele geçirmek ve özel kodumuza çağrılar yapmak için bir çerçeve sağlar. Bunu etkinleştirmek için çerçeveler, yerleşik ek davranışlarla soyutlamalar kullanır.

Kod Akışı kendi içerisinde ilerlerken sprin bu akışın bağmlılıklarını çözümlemekadına kendine bir akış sağlar.Temelde akış springe yönlenmiş olur.Sprinden bağımsız bir şekilde bu akışı bozarsak örneğin bir obje yaratımını IOC ye verdikten sonra tekrardan kendimiz bir new yaparsak spring bunu görmez çünkü akış kendisinden çıkmış olur
## IOC Temel Nesneleri
- Bean : bean, bir Spring uygulamasının omurgasını oluşturan ve Spring IoC konteyneri tarafından yönetilen java nesneleridir.
- Bean factory : Bean tanımlarını tutar. Beanin yasam döngüsünü başlatır. Onları başlatırken gerekli dependency leri ayarlar.En basit tabiriyle beanlari koordine eder. 
- application context : Genel bir yönetim sağlar. ApplicationContext, Spring uygulamalarında bean'leri (nesneleri) yönetir ve bunları ihtiyaç duyulduğunda uygulamanın diğer bileşenlerine enjekte eder. Bu sınıf, Spring uygulamasının başlatılması sırasında tanımlanan bean'lerin oluşturulmasını ve yönetilmesini sağlar.
ApplicationContext sınıfı, BeanFactory sınıfından türetilmiştir ve BeanFactory'ye ek olarak birçok ek özellik sunar(AplicationConntext context = new ClassPathXmlApplicationContext("");)  
# Spring uygulanması:

## with XML 
- xml içerisinde beans tag'inin altında beanler tanımlayarak uygulanır. Beanler arası dependency injectionlar da xml içerisinde hallolur. main class da xml i ayaga kaldırmak gerekir.Genellikle kullanmıcaz.  
- ```<bean id="myBean" class="com.example.MyBean">```(Temel bean tanımı)  
- ```<import resource="other.xml"/>```(fatklı xmli deiğer xmle import etme)  
- ```<bean id="parentBean" class="com.example.ParentBean" /> ||| <bean id="childBean" class="com.example.ChildBean" parent="parentBean" />```(inheritance)  
Application context beanleri eager li yaratır(lazy-init = false) bunu önlemek adına:  
- ```<bean id="myBean" class="com.example.MyBean" lazy-init="true">```  
Application context beanleri singleton(scope="singleton") yaratır.Tersi (scope="prototype").Eğer scope prototype ise lazy-init = true dur.    
- ```<bean id="myBean" class="com.example.MyBean" scope="prototype">```  
- ```<bean id="textEditor" class="com.example.TextEditor"> <constructor-arg ref="spellChecker" /> />```(consturtor inj)  
- ```<bean id="textEditor" class="com.example.TextEditor"> <property name="checker" ref="spellChecker" /> />```(setter inj)  
- ```<bean id="db" class="com.example.database"> <property name="uri" value="mongodb+srv//..." />```  
![Profile](https://github.com/omerulusoy41/SpringTemelleri/blob/master/ss/ValueInejction.jpg)  
## with Annotaions  
#### Annotations Nedir: Temel olarak, bir ek açıklama, bağlı olduğu kaynak koduna fazladan meta veri atar . Bir yönteme, arayüze, sınıfa veya alana açıklama ekleyerek şunları yapabiliriz:
- Derleyiciyi uyarılar ve hatalar hakkında bilgilendirin
- Kaynak kodunu derleme zamanında işleyin
- Çalışma zamanında davranışı değiştirin veya inceleyin
### Spring annotations  
- @Autowired :
