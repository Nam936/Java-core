# LIBRARY

### Câu 1
```roomsql
    select * from book b 
    inner join book_category bc on b.id = bc.id_book
    inner join category c on c.id = bc.id_category
    where c.name = 'drama' or c.name='comedy'
```
### Câu 2
```roomsql
    select ba.id_author ,b.title ,a.full_name ,c.name 
    from book b inner join book_author ba on b.id = ba.id_book 
    inner join author a on a.id = ba.id_author 
    inner join book_category bc on bc.id_book = b.id 
    inner join category c on c.id = bc.id_category 
    where b.year_of_publication between 1800 and 1900
```
### Câu 3
```roomsql
    select r.id, r.full_name ,r.dob ,r.gender ,r.address ,
    r.create_at ,r.status ,r.mobile ,bb2.status  from reader r 
    inner join borrow_back bb2 on r.id = bb2.id_reader 
    where bb2.status = 'incomplete'

```
### Câu 4
```roomsql
    select b.id ,b.title ,b.description ,b.page_number ,b.image ,
    b.year_of_publication ,a.full_name as name_author ,bbi.status  from book b
    inner join borrow_back_item bbi on b.id = bbi.id_book
    inner join book_author ba on b.id = ba.id_book 
    inner join author a on a.id = ba.id_author 
    where bbi.status = 'incomplete'
```
### Câu 5
```roomsql
    select count(b.id) as amount_book  from book b
    inner join publisher p on b.id_publisher = p.id 
    where p.name is not null  
```