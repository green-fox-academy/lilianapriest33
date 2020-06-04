package DataStructures.BlogPost;

public class Main {
    public static void main(String[] args) {
        BlogPost loremIpsum = new BlogPost("'Lorem Ipsum'", "John Doe", "2000.05.04.", "Lorem Ipsum dolor sit amet.");
        BlogPost waitBut = new BlogPost("'Wait but why'", "Tim Urban", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");
        BlogPost oneEngineer = new BlogPost("'One Engineer Is Trying to Get IBM to Reckon With Trump'", "William Turton", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");

        System.out.println(loremIpsum.title + " titled by " + loremIpsum.authorName + " posted at " + loremIpsum.publicationDate);
        System.out.println(loremIpsum.text);

        System.out.println(waitBut.title + " titled by " + waitBut.authorName + " posted at " + waitBut.publicationDate);
        System.out.println(waitBut.text);

        System.out.println(oneEngineer.title + " titled by " + waitBut.authorName + " at " + waitBut.publicationDate);
        System.out.println(oneEngineer.text);
    }
}