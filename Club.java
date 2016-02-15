import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    private Membership member3;
   
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
       members = new ArrayList<Membership>(); 
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership miembro)
    {
      members.add(miembro);  
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    /** Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     * */
     public int joinedMonth(int month)
     {
         int contadorMes = 0;
         while (month > 1 || month > 12)
         {
             System.out.println("El parametro introducido no es valido (de 1 a 12)");
         }
         
         for ( Membership member : members)
         {
             if (member.getMonth() == month)
             {
              contadorMes = contadorMes + 1;   
             }
         }
         return contadorMes;
         
     }
     /**
      *  Todos los socios que se han dado de alta un determinado mes de un determinado año se
      * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
      * por pantalla el error.
      * @param month El mes en el que estamos interesados
      * @param year El año en el que estamos interesados
      * @return Una coleccion con los socios que se han dado de baja del club
      */
     public ArrayList<Membership> purge( int month , int year)
     {
       ArrayList<Membership> baja= new ArrayList<>();
       while (month > 1 || month > 12)
         {
             System.out.println("El parametro introducido no es valido (de 1 a 12)");
         }
         Iterator <Membership> it = members.iterator();
         while (it.hasNext())
         {
             Membership members = it.next();
             if ( members.getMonth() == month && members.getYear() == year)
             {
                 baja.add(members);
                 it.remove();
                 
             }
         }
         return baja;
        
     }
     
}
