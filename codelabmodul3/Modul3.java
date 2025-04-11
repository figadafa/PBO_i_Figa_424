 //Superclass
 class CharacterGame{
    private String Name;
    private int Health;
  //constructor
    public CharacterGame(String Name, int Health){
        this.Name = Name;
        this.Health = Health;
    }
    //penggunan getter pada nama hero
    public String getName(){
       return Name;
    }
    //pengggunan setter dansetter pada health
    public int getHealth(){
        return Health;
    }
    public void sethealth(int Health){
        this.Health = Health;
    }
    //method yang akan di override
     public void Attack(CharacterGame target){
        System.out.println(getName()+"Menyerang"+ target.getName()+"Menggunakan !!");
     }
    

 }
 //sebclass hero
   class Hero extends CharacterGame{
       public Hero(String Name, int Health){
           super(Name, Health);
       }
     @Override
        public void Attack(CharacterGame target){
            System.out.println(getName()+"Menyerang "+ target.getName()+"Menggunakan Oribital Strike !!");
            target.sethealth(target.getHealth()-20);
            System.out.println(target.getName() +"Seakarang Meliki Kesehatan"+target.getHealth());
        }

   }
//subclass enemy
   class enemy extends CharacterGame{
       public enemy(String Name, int Health){
           super(Name, Health);
       }
       @Override
       public void Attack(CharacterGame target){
           System.out.println(getName()+"Menyerang "+ target.getName()+" Menggunakan Snake Bite !!");
           target.sethealth(target.getHealth()-15);
           System.out.println(target.getName()+"Seakarang Meliki Kesehatan "+target.getHealth());
       }
   }

public class Modul3 {
    public static void main(String[] args) {
        CharacterGame hero = new Hero(" Brimstone ", 150);
        CharacterGame enemy = new enemy(" Viper ", 200);
        
        //Menampilkan Kesehatan Hero dan Enemy
        System.out.println(hero.getName()+" Memiliki Kesehatan :"+hero.getHealth());   
        System.out.println(enemy.getName()+" Memiliki Kesehatan :"+enemy.getHealth());
        System.out.println();
        
        //Hero Menyerang Enemy
        hero.Attack(enemy); 
        System.out.println();
        //Enemy Menyerang Hero
        enemy.Attack(hero);


    }
}

