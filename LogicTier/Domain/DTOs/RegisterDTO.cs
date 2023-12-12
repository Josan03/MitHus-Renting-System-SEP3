using Domain.Models;

namespace Domain.DTOs;

public class RegisterDTO
{
    public string Email { get; set; }
    public string Password { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public Role Role { get; set; }
}