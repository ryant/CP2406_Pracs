public abstract class FixDebugBoat
{
   String boatType = new String();
   int passengers;
   String power = new String();
   public FixDebugBoat(String bt)
   {
      boatType = bt;
   }

   public boolean equals(FixDebugBoat otherBoat)
   {
      boolean result;
      if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
         result = true;
      else
         result = false;
      return result;
   }
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }
   public abstract void setPower();
   public abstract void setPassengers();
}