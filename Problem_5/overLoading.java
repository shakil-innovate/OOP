package Problem_5;

import java.sql.SQLOutput;

class Library
{
    static int unique=1;
    int id;
    String title;
    String author;

    Library(String title)
    {
        this("title","unknown");
    }
    Library(String title,String author)
    {
        this.title=title;
        this.author=author;
        id=unique++;
    }

    void details()
    {
        System.out.println(this.id+" "+this.title+" "+this.author+" ");
    }
}

public class overLoading {


    public static void main(String[] args) {
        Library b1=new Library("Good habit","SHAKIL");
        Library b2=new Library("HOW to look handsome");

       b1.details();
       b2.details();
    }
}
