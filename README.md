## (TR) Java dilinde Mayın Tarlası oyunu / (EN) Minesweeper game in Java language

### TR

- Oyun Kuralları :
- Oyun metin tabanlıdır.
- Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
- Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
- Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
- Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
- Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
- Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
- Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
- Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

********

### EN

- Minesweeper game in Java language
- Game rules :
- The game is text based.
- It should be played on two-dimensional arrays and designed within the MineSweeper class.
- The matrix size, that is, the number of rows and columns, should be determined by the user.
- A quarter of the number of elements of the array (number of elements / 4) should be randomly placed. For example, if the array is 4x3 in size, the number of elements should be calculated with the formula (Number of Rows * Number of Columns) and its size should be 12. In this case, the number of mines should be 12 / 4 = 3 pieces. (hint: you can create a second array to hold the positions of these mines.)
- The user must select a point on the matrix. For point selection, row and column values ​​must be entered.
- It should be checked whether the selected point is within the boundaries of the array and if the condition is not met, the point should be requested again.
- If there is a mine at the point where the user enters, he must lose the game.
- If there are no mines, all positions that touch the relevant point should be looked at (right, left, up, down, upper left diagonal, upper right diagonal, lower right diagonal, lower left diagonal) and the sum of the number of mines around should be written on the relevant point. If there is no mine touching the point, the value "0" should be assigned.
- If the user can select all the points without pressing any mines, he must win the game.