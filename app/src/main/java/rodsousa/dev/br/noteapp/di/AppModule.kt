package rodsousa.dev.br.noteapp.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import rodsousa.dev.br.noteapp.feature_note.data.data_source.NoteDataBase
import rodsousa.dev.br.noteapp.feature_note.data.repository.NoteRepositoryImpl
import rodsousa.dev.br.noteapp.feature_note.domain.repository.NoteRepository
import rodsousa.dev.br.noteapp.feature_note.domain.use_case.AddNote
import rodsousa.dev.br.noteapp.feature_note.domain.use_case.DeleteNote
import rodsousa.dev.br.noteapp.feature_note.domain.use_case.GetNotes
import rodsousa.dev.br.noteapp.feature_note.domain.use_case.NoteUseCases
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDataBase {
        return Room.databaseBuilder(
            app,
            NoteDataBase::class.java,
            NoteDataBase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDataBase): NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    fun provideNoteUseCases(repository: NoteRepository) : NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository)
        )
    }
}