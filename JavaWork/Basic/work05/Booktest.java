class Booktest {
    public static void main(String[] args) {
		/*
        BookPack.Book books[] = new BookPack.Book[4];
        books[0] = new BookPack.Book("�ڹٸ� ��ƶ�", "ȫ�浿", 2005);
        books[1] = new BookPack.Book("CSS", "�Ӳ���", 2012);
        books[2] = new BookPack.Book("Javascript", "�ŵ���", 2009);
        books[3] = new BookPack.Book("Html", "������", 2020);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
		*/
		
		Bookext books[] = new Bookext[4];
        books[0] = new Bookext("�ڹٸ� ��ƶ�", "ȫ�浿", 2005, "����");
        books[1] = new Bookext("CSS", "�Ӳ���", 2012, "����");
        books[2] = new Bookext("Javascript", "�ŵ���", 2009, "�Ѻ�");
        books[3] = new Bookext("Html", "������", 2020, "������");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
		}
	}
}