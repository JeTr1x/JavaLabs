package Pract3;

import java.util.Scanner;

public class Book {
    String author, name;
    int year, pages, votes;
    double rating;
    Book(String auth, String n, int y, int p, int v, double r){
        author = auth;
        name = n;
        year = y;
        pages = p;
        votes = v;
        rating = r;
    }
    void ChangeAuth(String auth){
        author = auth;
    }
    void ChangeName(String n){
        name = n;
    }
    void ChangeYear(int y){
        year = y;
    }
    void ChangePages(int p){
        pages = p;
    }
    void RateBook(int rate){
        rating = ((rating*votes)+rate)/(votes+1);
        votes++;
    }
    String getAuthor(){
        return author;
    }
    String getName(){
        return name;
    }
    int getYear(){
        return year;
    }
    int getPages(){
        return pages;
    }
    int getVotes(){
        return votes;
    }
    double getRating(){
        return rating;
    }

}

class BookTest{
    public static void main(String[] args){
        String author, name;
        int year, pages, votes;
        double rating;
        System.out.println("Input information about book");
        Scanner inp = new Scanner(System.in);
        System.out.println("Author:");
        author = inp.nextLine();
        System.out.println("Name:");
        name = inp.nextLine();
        System.out.println("Year:");
        year = inp.nextInt();
        System.out.println("Pages:");
        pages = inp.nextInt();
        System.out.println("Votes:");
        votes = inp.nextInt();
        System.out.println("Rating:");
        rating = inp.nextDouble();
        Book book1 = new Book(author, name, year, pages, votes, rating);
        System.out.println("Do you want to add your rate? (write yes or no)");
        Scanner ans = new Scanner(System.in);
        if(ans.nextLine().equals("yes")){
            System.out.println("Input your rate from 1 to 10");
            book1.RateBook(ans.nextInt());
            System.out.println("Your rate was added. New rating is " + book1.getRating() + " at " + book1.getVotes() + " votes.");
        }
    }

}