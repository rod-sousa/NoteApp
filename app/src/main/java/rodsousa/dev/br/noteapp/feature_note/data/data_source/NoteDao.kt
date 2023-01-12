package rodsousa.dev.br.noteapp.feature_note.data.data_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import rodsousa.dev.br.noteapp.feature_note.domain.model.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insetNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}