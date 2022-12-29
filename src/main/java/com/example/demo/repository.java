package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;

public interface repository extends JpaRepository<Mainlibrary,Integer> {
@Transactional 
@Modifying
@Query(value="Update mainlibrary l set l.book_id=?1, l.quantity=?2, l.book_name=?3, l.genre=?4 where l.book_id=?5", nativeQuery=true)
void updatevalue(int bookId,int quantity,String bookName, String genre,int bookid);

@Modifying
@Transactional 
@Query(value="DELETE FROM mainlibrary WHERE book_id=?1", nativeQuery=true)
void deleteAllByIdInBatch(int bookid);

@Query(value="SELECT * FROM mainlibrary l where l.genre=?1",nativeQuery=true)
List<Mainlibrary> findbygenre(String genre);
}
