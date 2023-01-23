package rodsousa.dev.br.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import rodsousa.dev.br.noteapp.R

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val  id: Int? = null)
{
    companion object{
        val noteColors = listOf(
            R.color.red_orange,
            R.color.light_green,
            R.color.violet,
            R.color.baby_blue,
            R.color.red_pink)
    }
}

class InvalidNoteException(message: String): Exception(message)
