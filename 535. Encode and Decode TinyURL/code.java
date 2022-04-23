// Simple Solution
public class Codec {
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortUrl;
    }
}

// Simplest Solution
public class Codec {
    int key = 1;
    HashMap<Integer,String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(key,longUrl);
        key++;
        return Integer.toString(key-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int tmp = Integer.parseInt(shortUrl);
        return map.get(tmp);
    }
}
