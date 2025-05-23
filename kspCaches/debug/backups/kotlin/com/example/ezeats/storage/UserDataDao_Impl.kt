package com.example.ezeats.storage

import androidx.room.EntityInsertAdapter
import androidx.room.RoomDatabase
import androidx.room.util.getColumnIndexOrThrow
import androidx.room.util.performSuspending
import androidx.sqlite.SQLiteStatement
import javax.`annotation`.processing.Generated
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.reflect.KClass

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class UserDataDao_Impl(
  __db: RoomDatabase,
) : UserDataDao {
  private val __db: RoomDatabase

  private val __insertAdapterOfUserData: EntityInsertAdapter<UserData>

  private val __stringListConverter: StringListConverter = StringListConverter()
  init {
    this.__db = __db
    this.__insertAdapterOfUserData = object : EntityInsertAdapter<UserData>() {
      protected override fun createQuery(): String =
          "INSERT OR ABORT INTO `user_data` (`id`,`email`,`password`,`is_logged_in`,`bookmarked_urls`) VALUES (nullif(?, 0),?,?,?,?)"

      protected override fun bind(statement: SQLiteStatement, entity: UserData) {
        statement.bindLong(1, entity.id.toLong())
        statement.bindText(2, entity.email)
        statement.bindText(3, entity.password)
        val _tmp: Int = if (entity.isLoggedIn) 1 else 0
        statement.bindLong(4, _tmp.toLong())
        val _tmp_1: String = __stringListConverter.fromList(entity.bookmarkedUrls)
        statement.bindText(5, _tmp_1)
      }
    }
  }

  public override suspend fun insert(user: UserData): Unit = performSuspending(__db, false, true) {
      _connection ->
    __insertAdapterOfUserData.insert(_connection, user)
  }

  public override suspend fun isUserLoggedIn(): Boolean {
    val _sql: String = "SELECT is_logged_in FROM user_data WHERE id = 1 LIMIT 1"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _result: Boolean
        if (_stmt.step()) {
          val _tmp: Int
          _tmp = _stmt.getLong(0).toInt()
          _result = _tmp != 0
        } else {
          _result = false
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getEmail(): String {
    val _sql: String = "SELECT email FROM user_data WHERE id = 1 LIMIT 1"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _result: String
        if (_stmt.step()) {
          _result = _stmt.getText(0)
        } else {
          error("The query result was empty, but expected a single row to return a NON-NULL object of type <kotlin.String>.")
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getPassword(): String {
    val _sql: String = "SELECT password FROM user_data WHERE id = 1 LIMIT 1"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _result: String
        if (_stmt.step()) {
          _result = _stmt.getText(0)
        } else {
          error("The query result was empty, but expected a single row to return a NON-NULL object of type <kotlin.String>.")
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getBookmarkedUrls(): UserData? {
    val _sql: String = "SELECT * FROM user_data WHERE id = 1 LIMIT 1"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _columnIndexOfId: Int = getColumnIndexOrThrow(_stmt, "id")
        val _columnIndexOfEmail: Int = getColumnIndexOrThrow(_stmt, "email")
        val _columnIndexOfPassword: Int = getColumnIndexOrThrow(_stmt, "password")
        val _columnIndexOfIsLoggedIn: Int = getColumnIndexOrThrow(_stmt, "is_logged_in")
        val _columnIndexOfBookmarkedUrls: Int = getColumnIndexOrThrow(_stmt, "bookmarked_urls")
        val _result: UserData?
        if (_stmt.step()) {
          val _tmpId: Int
          _tmpId = _stmt.getLong(_columnIndexOfId).toInt()
          val _tmpEmail: String
          _tmpEmail = _stmt.getText(_columnIndexOfEmail)
          val _tmpPassword: String
          _tmpPassword = _stmt.getText(_columnIndexOfPassword)
          val _tmpIsLoggedIn: Boolean
          val _tmp: Int
          _tmp = _stmt.getLong(_columnIndexOfIsLoggedIn).toInt()
          _tmpIsLoggedIn = _tmp != 0
          val _tmpBookmarkedUrls: List<String>
          val _tmp_1: String
          _tmp_1 = _stmt.getText(_columnIndexOfBookmarkedUrls)
          _tmpBookmarkedUrls = __stringListConverter.toList(_tmp_1)
          _result = UserData(_tmpId,_tmpEmail,_tmpPassword,_tmpIsLoggedIn,_tmpBookmarkedUrls)
        } else {
          _result = null
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun updateLoginStatus(status: Boolean) {
    val _sql: String = "UPDATE user_data SET is_logged_in = ? WHERE id = 1"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        val _tmp: Int = if (status) 1 else 0
        _stmt.bindLong(_argIndex, _tmp.toLong())
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun updateEmailAndPassword(email: String, password: String) {
    val _sql: String = "UPDATE user_data SET email = ?, password = ? WHERE id = 1"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        _stmt.bindText(_argIndex, email)
        _argIndex = 2
        _stmt.bindText(_argIndex, password)
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun updateBookmarkedUrls(urls: List<String>) {
    val _sql: String = "UPDATE user_data SET bookmarked_urls = ? WHERE id = 1"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        val _tmp: String = __stringListConverter.fromList(urls)
        _stmt.bindText(_argIndex, _tmp)
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun deleteUser() {
    val _sql: String = "DELETE FROM user_data WHERE id = 1"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public companion object {
    public fun getRequiredConverters(): List<KClass<*>> = emptyList()
  }
}
