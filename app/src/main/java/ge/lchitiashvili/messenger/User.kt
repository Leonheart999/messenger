package ge.lchitiashvili.messenger

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import lombok.Data

@Entity
@Data
data class User(
     @ColumnInfo(name = "nickname") val nickname: String,
     @ColumnInfo(name = "password") val password: String,
     @ColumnInfo(name = "full_name") val fullName: String,
     @ColumnInfo(name = "occupation") val occupation: String
){
     @PrimaryKey(autoGenerate = true)
     var id: Int = 0
}
