package com.example.android.news;

/**
 * {@link News} represents a single news.
 * Each object has properties: title, author, section, date
 */
public class News {

    /** Title of the book */
    private String mTitle;

    /** Author of the book */
    private String mAuthor;

    /** Website URL of the book */
    private String mSection;

    /** Date of the book */
    private String mDate;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title is the book's title
     * @param author is the book's author
     * @param date is the book's date
     * @param section is the website URL to find more details about the book
     */
    public News(String title, String author, String date, String section)
    {
        mTitle = title;
        mAuthor = author;
        mDate = date;
        mSection = section;
    }

    // Returns the book's title
    public String getTitle() { return mTitle; }

    // Returns the book's author
    public String getAuthor() {
        return mAuthor;
    }

    // Returns the book's date
    public String getDate() {
        return mDate;
    }

    // Returns the website URL to find more information about the book.
    public String getSection() { return mSection; }

}
