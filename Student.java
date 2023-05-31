class StudentOb
  {
     int id=1;
     String name="praveen";
     public void Study()
      {
       System.out.println("Student is studying");
      }
  }
    class student
    {
       public static void main(String[] args)
         {
           StudentOb s=new StudentOb();
            s.Study();
}
}