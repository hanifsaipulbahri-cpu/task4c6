function InstructorCard({ instructor, onSelectInstructor }) {
  return (
    <div className="instructor-card" onClick={() => onSelectInstructor(instructor)}>
      <img src={instructor.photo} alt={instructor.name} />
      <div className="instructor-card-content">
        <h2>{instructor.name}</h2>
        <p><strong><Category></Category></strong>{instructor.Specialization}</p>
        <p><strong><Category></Category></strong>{instructor.Status}</p>
        <p><strong><Category></Category></strong>{instructor.YearOfExperience} years of experience</p>
      </div>
    </div>
  );
}

export default InstructorCard;