package ge.lchitiashvili.messenger

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import lombok.Data
import java.util.*

@Entity
@Data
data class Message(
    @ColumnInfo(name = "conversation_id") val conversationId: Int,
    @ColumnInfo(name = "user_id") val user_id: Int,
    @ColumnInfo(name = "text") val text: String,
    @ColumnInfo(name = "time") val time: Date
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
