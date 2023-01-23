package rodsousa.dev.br.noteapp.feature_note.presentation.notes

import rodsousa.dev.br.noteapp.feature_note.domain.model.Note
import rodsousa.dev.br.noteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
