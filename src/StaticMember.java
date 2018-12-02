public class StaticMember {
    public static void main(String[] args) {

        FamillyMember dad = new FamillyMember();
        dad.name = "Janusz";
        dad.age = 32;

        FamillyMember mam = new FamillyMember();
        mam.name = "Grażyna";
        mam.age = 31;

        FamillyMember kid = new FamillyMember();
        kid.name = "Pioter";
        kid.age = 3;

showMember(mam);
showMember(dad);
showMember(kid);


FamillyMember.surname = "Kowalski";

        showMember(mam);
        showMember(dad);
        showMember(kid);



    }


    static void showMember(FamillyMember member){

        System.out.print(member.name);
        System.out.print(" ");
        System.out.print(member.surname);
        System.out.print(" ");
        System.out.print(member.age);
        System.out.println();



    }




}



class  FamillyMember {
    static String surname = "Nowak"; //niezmienne dla każdego w tej klasie więc static
    String name;
    int age;




}
