package ge.lchitiashvili.messenger

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import lombok.Data

@Data
@Entity
data class Conversation(
    @ColumnInfo(name = "user_id1") val user1: Int,
    @ColumnInfo(name = "user_id2") val user2: Int,
    val messages : List<Message>
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
