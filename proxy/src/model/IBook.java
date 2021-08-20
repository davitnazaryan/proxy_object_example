package model;


    public interface IBook {

        void setTitle(String name);

        void setPageCount(int pageCount);

        void setAuthor(String name);

        String getAuthor();

        String getTitle();

        int getPageCount();


    }
