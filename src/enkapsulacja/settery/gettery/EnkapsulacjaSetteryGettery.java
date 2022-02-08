
package enkapsulacja.settery.gettery;
/**
 * 
 * @author pawelstradomski
 */
public class EnkapsulacjaSetteryGettery {

    /* Enkapsulacja (hermetyzacja) - pakowanie wlasciwosci w taki sposob aby nie bylo
                                     do nich bezposredniego dostepu z innych class.*/
    
    public static void main(String[] args) 
    {
       kontoBankowe oszczednosciowe = new kontoBankowe();
       
       {
           if (oszczednosciowe.wyplac(500))
       
           System.out.println("wyplacono");
       else
            System.out.println("za malo kasy na koncie");
       }
       
       if (oszczednosciowe.wplac(50))
            System.out.println("wplacono kase");
       else
            System.out.println("za mala wplata");
        System.out.println("Na koncie masz:" + oszczednosciowe.getSaldo());
        
       
    }
    
}
class kontoBankowe
{

    public kontoBankowe() //dodatkowa opcja. Nie jest konieczna
    {
        saldo = 1000;
    }
    
    private int saldo;
    
    int getSaldo()     // get - pobierz
    {
        return saldo;
    }
    boolean setSaldo(int saldo) // pozwala ustawic saldo z zewnatrz. Jak bedzie "private" to z zewn nie ustawi salda
    {
        this.saldo = saldo;
        return true;
    }
    boolean wyplac(int ile)
    {
        if (saldo < ile)
            return false;
        else
            saldo-=ile; //albo setSaldo(saldo-ile);
        return true;
        
    }
    boolean wplac(int ile)
    {
        if (ile<100)
            return false;
        else
            saldo+=ile;
        return true;
    }

}

