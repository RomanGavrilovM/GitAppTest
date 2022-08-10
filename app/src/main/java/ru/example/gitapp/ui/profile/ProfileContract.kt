package ru.example.gitapp.ui.profile

import ru.example.gitapp.domain.UserEntity

interface ProfileContract {

    interface View {
        fun showUserDetail(user: UserEntity)
    }

    interface Presenter {
        fun attach(view: View)

        fun detach()

        fun loadData()
    }
}