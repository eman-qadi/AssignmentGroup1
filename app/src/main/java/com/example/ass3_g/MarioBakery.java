package com.example.ass3_g;

public class MarioBakery {

    private final String name;
    private final int idImg;
    private String description;

    public static final MarioBakery[] mariobaber={

            new MarioBakery("Pies with cheese",R.drawable.pic1,"Dough stuffed with delicious delicious cheese\n" +"Price per piece:\n" + "Big size 30\n" + "Medium size 20\n" + "Small size 10"),
            new MarioBakery("Pizza with vegetables",R.drawable.pic2,"It contains beneficial vegetables (pepper, tomatoes, corn, black and green olives, mushrooms) in addition to the main ingredient which is cheese\n" + "Price per piece:\n" + "Big size 40\n" + "Medium size 25\n" + "Small size 12"),
            new MarioBakery("spinach pie",R.drawable.pic3,"Dough stuffed with delicious fresh spinach and full of beneficial nutrients\n" + "Price per piece:\n" + "Big size 30\n" + "Medium size 20\n" + "Small size 10"),
            new MarioBakery("Kebbeh with grilled meat",R.drawable.pic4,"Rich in bulgur, fresh meat and delicious spices\n" + "Price per piece: 8"),
            new MarioBakery("Pastries with sausages",R.drawable.pic5,"Dough stuffed with delicious grilled sausage\n" + "Price per piece:\n" + "Big size 30\n" + "Medium size 20\n" + "Small size 10"),
            new MarioBakery("White bread",R.drawable.pic6,"Flour bread that is soft, hot and saturated\n" + "Price per piece: 2\n" + "The price of one kilo is 8"),
            new MarioBakery("Black bread",R.drawable.pic7,"Soft, hot and saturated wheat bread for dieters\n" + "Price per piece: 2\n" + "The price of one kilo is 8"),
            new MarioBakery("Ajout",R.drawable.pic8,"Dough stuffed with delicious saturated chocolate\n" + "Price per piece:\n" + "Big size 12\n" + "Medium size 7\n" + "Small size 3"),
            new MarioBakery("Maamoul with dates",R.drawable.pic9,"Filled with delicious dates that are useful for all occasions\n" + "The price of one kilo is 20"),
            new MarioBakery("Sesame cakes",R.drawable.pic10,"Sweet and tender cakes for tea lovers\n" + "The price of one kilo is 9"),
    };

    public MarioBakery(String name, int idImg, String description) {
        this.name = name;
        this.idImg = idImg;
        this.description=description;
    }
    public String getName() {
        return name;
    }
    public int getIdImg() {
        return idImg;
    }
    public String getDescription() {
        return description;
    }
}