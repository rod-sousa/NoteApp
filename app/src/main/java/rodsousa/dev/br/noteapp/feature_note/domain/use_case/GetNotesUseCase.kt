package rodsousa.dev.br.noteapp.feature_note.domain.use_case

import kotlinx.coroutines.flow.Flow
import rodsousa.dev.br.noteapp.feature_note.data.data_source.NoteDao
import rodsousa.dev.br.noteapp.feature_note.data.repository.NoteRepositoryImpl
import rodsousa.dev.br.noteapp.feature_note.domain.model.Note
import rodsousa.dev.br.noteapp.feature_note.domain.repository.NoteRepository

class GetNotesUseCase(
    private var repository: NoteRepository
) {

    operator fun invoke(): Flow<List<Note>>{

    }
}