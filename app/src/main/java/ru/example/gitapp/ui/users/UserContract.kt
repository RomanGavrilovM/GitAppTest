package ru.example.gitapp.ui.users

import ru.example.gitapp.domain.UserEntity

interface UserContract {

    interface View {
        fun showUsers(users: List<UserEntity>)

        fun showError(throwable: Throwable)

        fun showProgress(inProgress: Boolean)
    }

    interface Presenter {
        fun attach(view: View)

        fun detach()

        suspend fun onRefresh()
    }
}