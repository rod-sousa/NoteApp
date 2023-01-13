package rodsousa.dev.br.noteapp.feature_note.data.data_source

import androidx.room.Database
import rodsousa.dev.br.noteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDataBase {

    abstract val noteDao: NoteDao
}