package rodsousa.dev.br.noteapp.feature_note.presentation.notes

import rodsousa.dev.br.noteapp.feature_note.domain.model.Note
import rodsousa.dev.br.noteapp.feature_note.domain.util.NoteOrder
import rodsousa.dev.br.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOderSectionVisible: Boolean = false
) {

}