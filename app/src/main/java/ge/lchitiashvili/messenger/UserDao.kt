package ge.lchitiashvili.messenger

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("Select * from User")
    fun findAll(): List<User>

    @Insert
    fun addUser(movie: User)

    @Query("Select * from User where id = :userId")
    fun findUserById(userId: Int): User
}