interface Searchable {
    void search(String keyword);
}

class Document implements Searchable {
    String text = "This is a sample document with some text.";
    public void search(String keyword) {
        if (text.contains(keyword)) {
            System.out.println("Found '" + keyword + "' in Document.");
        } else {
            System.out.println("Keyword not found in Document.");
        }
    }
}

class WebPage implements Searchable {
    String html = "<html><body>Welcome to my webpage</body></html>";
    public void search(String keyword) {
        if (html.contains(keyword)) {
            System.out.println("Found '" + keyword + "' in WebPage.");
        } else {
            System.out.println("Keyword not found in WebPage.");
        }
    }
}

public class Interface9 {
    public static void main(String[] args) {
        Searchable doc = new Document();
        Searchable web = new WebPage();

        doc.search("sample");
        web.search("Welcome");
    }
}
