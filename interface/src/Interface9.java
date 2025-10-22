// Interface9.java
interface Searchable {
    void search(String keyword);
}

class Document implements Searchable {
    private String text;

    public Document(String text) {
        this.text = text;
    }

    @Override
    public void search(String keyword) {
        if (text.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in Document.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in Document.");
        }
    }
}

class WebPage implements Searchable {
    private String content;

    public WebPage(String content) {
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in WebPage.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in WebPage.");
        }
    }
}

public class Interface9 {
    public static void main(String[] args) {
        Document doc = new Document("Java is a powerful programming language.");
        WebPage page = new WebPage("Learn Java online with tutorials and examples.");

        doc.search("powerful");
        doc.search("Python");

        page.search("tutorials");
        page.search("C++");
    }
}
