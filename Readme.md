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

# Spring uygulanması:

## with XML 
- xml içerisinde beans tag'inin altında beanler tanımlayarak uygulanır. Beanler arası dependency injectionlar da xml içerisinde hallolur. main class da xml i ayaga kaldırmak gerekir.Genellikle kullanmıcaz.  
## with Annotaions
- @Autowired :
