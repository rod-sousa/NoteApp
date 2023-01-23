package rodsousa.dev.br.noteapp.feature_note.domain.use_case

import rodsousa.dev.br.noteapp.feature_note.domain.model.Note
import rodsousa.dev.br.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}