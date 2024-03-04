package Praktikum01;

public class no10 {

    public static void main(String[] args) {        
        String str1 = "Zuhdl";
        String str2 = "Didi"; 
        String str3 = "ZUHDI";

        // charAt(int index): Mengembalikan karakter pada posisi tertentu dalam string
        char ch = str1.charAt(0);
        System.out.println("Karakter pertama dari str1: " + ch);
 
        // compareTo(): Membandingkan dua string leksikografis
        int compareResult = str1.compareTo(str2);
        System.out.println("Hasil perbandingan leksikografis str1 dan str2: " + compareResult);

        // compareToIgnoreCase(): Membandingkan dua string tanpa memperhatikan kapitalisasi
        int ignoreCaseCompareResult = str1.compareToIgnoreCase(str3);
        System.out.println("Hasil perbandingan leksikografis (ignore case) str1 dan str3: " + ignoreCaseCompareResult);

        // concat(): Menggabungkan dua string
        String concatStr = str1.concat(str2);
        System.out.println("Gabungan str1 dan str2: " + concatStr);

        // contains(): Memeriksa apakah string mengandung substring tertentu
        boolean contains = concatStr.contains("World");
        System.out.println("Apakah concatStr mengandung 'World'?: " + contains);

        // copyValueOf(char[] data): Membuat string dari array karakter yang diberikan
        String copiedStr = String.copyValueOf(new char[]{'a', 'b', 'c'});
        System.out.println("String hasil copyValueOf: " + copiedStr);

        // equals(): Memeriksa apakah dua string sama
        boolean isEqual = str1.equals(str3);
        System.out.println("Apakah str1 sama dengan str3?: " + isEqual);

        // equalsIgnoreCase(): Memeriksa apakah dua string sama tanpa memperhatikan kapitalisasi
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("Apakah str1 sama dengan str3 (ignore case)?: " + isEqualIgnoreCase);

        // format(String format, Object... args): Menggantikan setiap placeholder dalam string format dengan argumen yang diberikan
        String formattedStr = String.format("Hello, %s", "World");
        System.out.println("String hasil format: " + formattedStr);

        // hashCode(): Mengembalikan nilai hash dari string
        int hashCode = str1.hashCode();
        System.out.println("Nilai hash dari str1: " + hashCode);

        // indexOf(int ch): Mengembalikan indeks dari karakter pertama yang ditemukan dalam string
        int indexOfChar = str1.indexOf('l');
        System.out.println("Indeks karakter 'l' dalam str1: " + indexOfChar);

        // isBlank(): Memeriksa apakah string kosong atau hanya terdiri dari whitespace
        String blankStr = "   ";
        boolean isBlank = blankStr.isBlank();
        System.out.println("Apakah blankStr kosong atau hanya whitespace?: " + isBlank);

        // length(): Mengembalikan panjang string
        int length = str1.length();
        System.out.println("Panjang str1: " + length);

        // lines(): Membagi string menjadi baris-baris
        String multilineStr = "Hello\nWorld\n!";
        String[] lines = multilineStr.lines().toArray(String[]::new);
        System.out.println("Baris-baris dari multilineStr:");
        for (String line : lines) {
            System.out.println(line);
        }

        // matches(String regex): Memeriksa apakah string cocok dengan pola ekspresi reguler
        boolean matches = str1.matches("[a-zA-Z]+");
        System.out.println("Apakah str1 hanya terdiri dari huruf?: " + matches);

        // repeat(int count): Mengulang string sebanyak count kali
        String repeatedStr = str1.repeat(3);
        System.out.println("String hasil repeat: " + repeatedStr);

        // replace(char oldChar, char newChar): Mengganti setiap kemunculan oldChar dengan newChar dalam string
        String replacedStr = str1.replace('l', 'x');
        System.out.println("String hasil replace: " + replacedStr);

        // replaceAll(String regex, String replacement): Mengganti setiap substring yang cocok dengan ekspresi reguler dengan pengganti yang diberikan
        String replacedAllStr = str1.replaceAll("[aeiou]", "*");
        System.out.println("String hasil replaceAll: " + replacedAllStr);

        // replaceFirst(String regex, String replacement): Mengganti substring pertama yang cocok dengan ekspresi reguler dengan pengganti yang diberikan
        String replacedFirstStr = str1.replaceFirst("[aeiou]", "*");
        System.out.println("String hasil replaceFirst: " + replacedFirstStr);

        // split(String regex): Membagi string menjadi array substring berdasarkan ekspresi reguler
        String[] splitStr = str1.split("");
        System.out.println("Hasil split str1:");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // substring(int beginIndex): Mengambil substring dari string mulai dari indeks yang ditentukan
        String subStr1 = str1.substring(2);
        System.out.println("Substring dari str1 mulai dari indeks 2: " + subStr1);

        // substring(int beginIndex, int endIndex): Mengambil substring dari string mulai dari indeks yang ditentukan hingga sebelum indeks yang ditentukan
        String subStr2 = str1.substring(1, 4);
        System.out.println("Substring dari str1 mulai dari indeks 1 hingga 4: " + subStr2);

        // toCharArray(): Mengubah string menjadi array karakter
        char[] charArray = str1.toCharArray();
        System.out.println("Array karakter dari str1:");
        for (char c : charArray) {
            System.out.println(c);
        }

        // toLowerCase(): Mengubah semua karakter dalam string menjadi huruf kecil
        String lowerCaseStr = str1.toLowerCase();
        System.out.println("String dalam huruf kecil: " + lowerCaseStr);

        // toString(): Mengembalikan string itu sendiri
        String strToString = str1.toString();
        System.out.println("String hasil toString: " + strToString);

        // toUpperCase(): Mengubah semua karakter dalam string menjadi huruf besar
        String upperCaseStr = str1.toUpperCase();
        System.out.println("String dalam huruf besar: " + upperCaseStr);

        // trim(): Menghapus spasi awal dan akhir dari string
        String trimStr = "  Trim me!  ";
        String trimmedStr = trimStr.trim();
        System.out.println("String hasil trim: '" + trimmedStr + "'");

        // valueOf(boolean b): Mengubah nilai boolean menjadi string
        String valueOfBoolean = String.valueOf(true);
        System.out.println("String hasil valueOf boolean: " + valueOfBoolean);

        // valueOf(char c): Mengubah karakter menjadi string
        String valueOfChar = String.valueOf('a');
        System.out.println("String hasil valueOf char: " + valueOfChar);

        // valueOf(char[] data): Mengubah array karakter menjadi string
        String valueOfCharArray = String.valueOf(new char[]{'a', 'b', 'c'});
        System.out.println("String hasil valueOf char array: " + valueOfCharArray);

        // valueOf(double d): Mengubah nilai double menjadi string
        String valueOfDouble = String.valueOf(3.14);
        System.out.println("String hasil valueOf double: " + valueOfDouble);

        // valueOf(float f): Mengubah nilai float menjadi string
        String valueOfFloat = String.valueOf(3.14f);
        System.out.println("String hasil valueOf float: " + valueOfFloat);

        // valueOf(int i): Mengubah nilai integer menjadi string
        String valueOfInt = String.valueOf(42);
        System.out.println("String hasil valueOf integer: " + valueOfInt);

        // valueOf(long l): Mengubah nilai long menjadi string
        String valueOfLong = String.valueOf(1234567890L);
        System.out.println("String hasil valueOf long: " + valueOfLong);

    }
}
